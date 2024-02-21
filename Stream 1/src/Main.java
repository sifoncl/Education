import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Collection<String> strings = Arrays.asList("По опушкам лесов, на лесных полянах ранней весной расцветают цветы."
                , "Это подснежники login"
                , "Вася"
                , "Петя"
                , "Подснежники — цветы ранние."
                , "Лес в эту пору наполнен птичьими голосами, и голоса эти слышатся везде."
                , "Набухли на деревьях пахучие смолистые почки"
                , "На макушках высоких берёз звонко свистят весенние гости."
                , "А вот сидит на дубе и громко воркует чудесный голубь"
                , "Ещё не растаял в оврагах снег"
                , "Около деревьев, на проталинах — всюду цветут белым и голубым ковром прелестные подснежники."
                , "Приятно собрать и поставить на стол букет этих свежих цветов."
                , "И кажется, что слышишь голос леса: «Ребята, любите и оберегайте природу!login»"
        );
        long loginCounter = strings.stream().filter(x -> x.contains("login")).count();

        String longest = strings.stream().max(Comparator.comparingInt(String::length)).get();
        String shortest = strings.stream().min(Comparator.comparingInt(String::length)).get();
        List<String> stringFromOneWords = strings.stream().filter(x -> x.matches("[a-zA-Zа-яА-Я]+")).toList();
        Set<String> words = new HashSet<>();
        strings.stream().map(x -> x.replaceAll("\\p{Punct}|—", ""))
                .map(x -> x.split(" ")).forEach(x -> Arrays.stream(x).forEach(words::add));


        System.out.println(loginCounter);
        System.out.println(longest);
        System.out.println(shortest);
        System.out.println(stringFromOneWords);
        System.out.println(words);

    }
}