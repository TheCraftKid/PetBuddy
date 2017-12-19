package com.thecraftkid.pets.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.thecraftkid.pets.Food;
import com.thecraftkid.pets.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * Created by willie on 7/23/17.
 * <p>
 * Storage consists of key-value pairs, or JSON, essentially, at one level of hierarchy
 */
public class StorageManager {

    public static final String KEY_PLAYER = "player";

    public static StorageManager sInstance = new StorageManager();

    public static StorageManager getInstance() {
        return sInstance;
    }

    private static final String RESOURCES_PATH = "resources/";

    private static final String PLAYER_PATH = RESOURCES_PATH + "player.json";

    private static final String PET_PATH = RESOURCES_PATH + "pets.json";

    private static final String FOODS_PATH = RESOURCES_PATH + "foods.json";

    public void persist(Map<String, Object> map) {
        Gson gson = new Gson();
        String string = gson.toJson(map);
    }

    public void persist(String filename, String key, String value) {

    }

    public Player getPlayer() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(PLAYER_PATH);
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            StringBuilder result = new StringBuilder();
            String content;
            while ((content = reader.readLine()) != null) {
                result.append(content);
            }
            return new Gson().fromJson(result.toString(), Player.class);
        }
    }

    public List<Food> getFoods() throws IOException {

    }

    public <T> T getPlayerValue(JsonObject player, String key) {
        return (T) player.get(key);
    }
}
