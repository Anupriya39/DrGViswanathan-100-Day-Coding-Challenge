import java.util.*;

class Twitter {
    private int timestamp;
    private Map<Integer, List<int[]>> tweets;
    private Map<Integer, Set<Integer>> followMap;

    public Twitter() {
        timestamp = 0;
        tweets = new HashMap<>();
        followMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>())
              .add(new int[]{timestamp++, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        addRecentTweets(userId, pq);

        Set<Integer> followees = followMap.get(userId);
        if (followees != null) {
            for (int followee : followees) {
                addRecentTweets(followee, pq);
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty() && result.size() < 10) {
            result.add(pq.poll()[1]);
        }

        return result;
    }

    private void addRecentTweets(int userId, PriorityQueue<int[]> pq) {
        List<int[]> list = tweets.get(userId);

        if (list == null) {
            return;
        }

        int start = Math.max(0, list.size() - 10);

        for (int i = start; i < list.size(); i++) {
            pq.offer(list.get(i));
        }
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }

        followMap.computeIfAbsent(followerId, k -> new HashSet<>())
                 .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = followMap.get(followerId);

        if (set != null) {
            set.remove(followeeId);
        }
    }
}
