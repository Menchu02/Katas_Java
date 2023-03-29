package com.kata.RPG;

public class CharacterRpg {


 private Long health = 1000L;

 private Integer level = 1;

 private Boolean alive= true;

    public Long getHealth() {
        return health;
    }

    public Integer getLevel() {
        return level;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public void attack(CharacterRpg victim, long damage) {

        victim.damage(damage);
    }

    public void  damage( Long damage){

        this.health -= damage;
        if(this.health <= 0 ){
            this.alive= false;

        }
    }

    public void heals(CharacterRpg victim, long healing ) {
        victim.healing(healing);


    }
    public void healing(Long healing){
        if(this.alive== false){
            this.health += 0;
        }
        if(this.alive == true){
            this.health += healing;
        }
        if(this.health> 1000){
            setHealth(1000L);
        }

    }
}
