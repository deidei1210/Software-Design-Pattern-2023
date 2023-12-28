package Flyweight;

import Prototype.MathMember;
import Prototype.Member;
import Prototype.PoliticsMember;
import Prototype.EnglishMember;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class AttributeFactory {
    private static final Map<String, Map<String,Member>> GroupMemberMap = Map.of(
            "Math",new HashMap<>(),
            "English",new HashMap<>(),
            "Politics",new HashMap<>()
    );
    private static final Map<String, Type> MemberType = Map.of(
            "Math",MathMember.class,
            "English",EnglishMember.class,
            "Politics",PoliticsMember.class
    );
    public static Member setMember(String subject,String school){
        Member member = GroupMemberMap.get(subject).get(school);
        if(member == null){
            switch(subject){
                case "Math":
                    member = new MathMember(school);
                    break;
                case "English":
                    member = new EnglishMember(school);
                    break;
                case "Politics":
                    member = new PoliticsMember(school);
                    break;
            }
            GroupMemberMap.get(subject).put(school,member);
            System.out.println("Here is the first "+ subject +" Member in "+school );
        }
        return member;
    }
}
