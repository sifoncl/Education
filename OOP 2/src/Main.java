import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime dayOfSupply1 = LocalDateTime.of(2024, 1, 12, 12, 30);
        LocalDateTime dayOfSupply2 = LocalDateTime.of(2024, 1, 10, 12, 30);
        LocalDateTime dayOfSupply3 = LocalDateTime.of(2024, 1, 9, 12, 30);
        LocalDateTime dayOfSupply4 = LocalDateTime.of(2024, 1, 11, 12, 30);
        Orchid orcgid1 = new Orchid(dayOfSupply1, "розовый");
        Orchid orcgid2 = new Orchid(dayOfSupply3, "красный");
        Aster aster1 = new Aster(dayOfSupply2, "розовый");
        Aster aster2 = new Aster(dayOfSupply4, "желтый");
        Peony peony1 = new Peony(dayOfSupply2, "фиолетовый");
        Peony peony2 = new Peony(dayOfSupply1, "белый");
        Tulip tulip1 = new Tulip(dayOfSupply1, "желтый");
        Tulip tulip2 = new Tulip(dayOfSupply2, "синий");
        Rose rose1 = new Rose(dayOfSupply3, "черный");
        Rose rose2 = new Rose(dayOfSupply4, "красный");

        Flower[] avalibleFlowers = {orcgid1, orcgid2, aster1, aster2, peony1, peony2, tulip1, tulip2, rose1, rose2};

        BouquetJenerator.printBouquet(5, avalibleFlowers);

    }
}