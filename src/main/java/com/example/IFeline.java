package com.example;

import java.util.List;

public interface IFeline extends Predator {
    int getKittens();
    List<String> getFood(String animalKind) throws Exception;
}
