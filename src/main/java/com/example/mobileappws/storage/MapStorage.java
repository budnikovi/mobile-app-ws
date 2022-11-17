package com.example.mobileappws.storage;

import com.example.mobileappws.model.responce.UserRest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class MapStorage implements Map<String,UserRest>{
    private Map<String, UserRest> users;

    @Override
    public int size() {
        return users.size();
    }

    @Override
    public boolean isEmpty() {
        return users.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return users.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return users.containsValue(value);
    }

    @Override
    public UserRest get(Object key) {
        return users.get(key);
    }

    @Override
    public UserRest put(String key, UserRest value) {
        if (users == null) {
            users = new HashMap<>();
        }
        return users.put(key,value);
    }

    @Override
    public UserRest remove(Object key) {
        return users.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends UserRest> m) {
        users.putAll(m);
    }

    @Override
    public void clear() {
        users.clear();
    }

    @Override
    public Set<String> keySet() {
        return users.keySet();
    }

    @Override
    public Collection<UserRest> values() {
        return users.values();
    }

    @Override
    public Set<Entry<String, UserRest>> entrySet() {
        return users.entrySet();
    }

}
