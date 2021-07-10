package ru.job4j.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

 class Card {
    private static Suit suit;
    private Value value;

     public Card(Suit suit, Value value) {
         this.suit = suit;
         this.value = value;
     }

     @Override
     public String toString() {
         return "Card{"
                 + "suit="
                 + suit
                 + ", value="
                 + value
                 + '}';
     }

     public static void main(String[] args) {
         Stream.of(Suit.values())
                 .flatMap(suit -> Stream.of(Value.values()))
                 .map(value -> new Card(suit, value))
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
     }
 }