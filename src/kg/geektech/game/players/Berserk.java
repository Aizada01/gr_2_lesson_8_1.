package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;


    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            if (boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - this.getDamage() - this.getSavedDamage());
                System.out.println("Berserk hits superpower");
            }

        }

    }
