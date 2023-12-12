package Prototype;

import java.util.Hashtable;

public class FansCache {
    private static Hashtable<String, Fans> fansHashtable
            = new Hashtable<String, Fans>();

    //复制粉丝
    public static Fans getFans(String audienceId) throws CloneNotSupportedException {
        Fans cachedFans = fansHashtable.get(audienceId);
        return (Fans) cachedFans.clone();
    }

    //访问Cache
    public static void loadCache() {
        EDGFans edgAudience = new EDGFans();
        edgAudience.setId("1");
        fansHashtable.put(edgAudience.getId(), edgAudience);

        IGFans igAudience = new IGFans();
        igAudience.setId("2");
        fansHashtable.put(igAudience.getId(), igAudience);

        RNGFans rngAudience = new RNGFans();
        rngAudience.setId("3");
        fansHashtable.put(rngAudience.getId(), rngAudience);
    }
}
