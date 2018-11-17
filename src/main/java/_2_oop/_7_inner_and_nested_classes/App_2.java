package _2_oop._7_inner_and_nested_classes;

import java.util.ArrayList;
import java.util.Objects;

/**
 * inner class
 */
public class App_2 {
    public static void main(String[] args) {
        Network facebook = new Network();
        Network vk = new Network();

        Network.Member markFb = facebook.addMember("Mark");
        Network.Member billVk = vk.addMember("Bill");

        System.out.println(markFb + " belongs to FB: " + markFb.belongsTo(facebook));
        System.out.println(markFb + " belongs to VK: " + markFb.belongsTo(vk) + "\n");

        facebook.addMember(billVk);
        vk.addMember(facebook.new Member("Poll"));

        System.out.println("Facebook: " + facebook.members);
        System.out.println("Vkontakte: " + vk.members);

//        billVk.leave();
//        System.out.println();
//        System.out.println("Facebook: " + facebook.members);
//        System.out.println("Vkontakte: " + vk.members);
    }
}


class Network {
    ArrayList<Member> members = new ArrayList<>();

    Member addMember(String memberName) {
        Member member = new Member(memberName);
        members.add(member);
        return member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Network network = (Network) o;
        return Objects.equals(members, network.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members);
    }

    void addMember(Member member) {
        members.add(member);
    }

    class Member {
        // во вложенных классах нельзя описывать ничего статического
//        static String token;
        String name;

        public Member(String name) {
            this.name = name;
        }

        public void leave() {
            members.remove(this);
//            Network.this.members.remove(this);
        }

        public boolean belongsTo(Network network) {
            return Network.this == network;
        }

        @Override
        public String toString() {
            return "Member{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
}