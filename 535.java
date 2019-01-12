public class Codec {
    public static Map<String, String> urlPairs = new HashMap();
    
    public String getRandomStr(int num){
        String ret = "";
        for(int i=0; i<num ; i++){
            final long l = System.currentTimeMillis();
            final char s = (char)( l % 26 );
            ret += (char)('a'+s);
        }
        return ret;
    }
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        //every 'int' is 32 bit. every ascii has 128 types.
        int splashPos = longUrl.indexOf(":");
        String ret = longUrl.substring(0,splashPos+1);
        int no = longUrl.length()-splashPos-2;
        ret += getRandomStr(no);
        
        urlPairs.put(ret, longUrl);
        return ret;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlPairs.get(shortUrl).toString();
    }
}

// URL, DECODE, ENCODE, MAP,  KV MODULE¡£