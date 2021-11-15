package com.pb.enot.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Sizes.XS, "темно-серый", 350),
                new Tshirt(Sizes.L, "черный", 250),
                new Pants(Sizes.L, "синий", 500),
                new Pants(Sizes.L, "красный", 380),
                new Skirt(Sizes.S, "розовый", 400),
                new Skirt(Sizes.M, "красный", 520),
                new Tie(Sizes.L, "синий", 300),
                new Tie(Sizes.L, "красный", 280),
        };

        dressMale(clothes);
        System.out.println();
        dressFemale(clothes);
    }

    public static void dressMale(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public static void dressFemale(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof dressWomen) {
                System.out.println(clothe);
            }
        }
    }
}