package com.project.service;
import java.util.*;
public interface Service<T> {
    List<T> list();
    T creates(T t);
    Optional<T> get(int id);
    void update(T t, int id);
    void delete(int id);
}
