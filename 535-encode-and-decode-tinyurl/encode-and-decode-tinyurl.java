public class Codec {

    static HashMap<String, String> map = new HashMap<>();

    static int counter = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = String.valueOf(counter);

        counter++;

        map.put(key, longUrl);

        return "https://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        String key = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);

        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));