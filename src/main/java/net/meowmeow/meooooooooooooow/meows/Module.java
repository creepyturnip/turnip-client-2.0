package net.meowmeow.meooooooooooooow.meows;

public class Module {
    private String name;
    private String description;
    public Category category;
    private int key;
    private boolean enabled;

    public String getName() {
        return name;
    }


    public void Toggle() {
        this.enabled =  !this.enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }
    public void onEnable() {

    }
    public void onDisable() {

    }

    public void onTick() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Category getCategory() {
        return category;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;

        if (enabled) onEnable();
        else onDisable();
    }
    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public enum Category {
        COMBAT,
        MOVEMENT,
        MEOW
    }
}