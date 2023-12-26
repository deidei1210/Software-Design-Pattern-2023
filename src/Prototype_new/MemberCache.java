package Prototype_new;

import java.util.Hashtable;

public class MemberCache {
    private static final Hashtable<String, Member> memberHashtable
            = new Hashtable<>();

    //复制粉丝
    public static Member getMember(String memberId) {
        Member cachedMember = memberHashtable.get(memberId);
        return (Member) cachedMember.clone();
    }

    //访问Cache
    public static void loadCache() {
        MathMember mathMember = new MathMember();
        mathMember.setId("1");
        memberHashtable.put(mathMember.getId(), mathMember);

        EnglishMember englishMember = new EnglishMember();
        englishMember.setId("2");
        memberHashtable.put(englishMember.getId(), englishMember);

        PoliticsMember politicsMember = new PoliticsMember();
        politicsMember.setId("3");
        memberHashtable.put(politicsMember.getId(), politicsMember);
    }
}
