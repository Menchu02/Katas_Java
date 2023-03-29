package com.kata.RPG;

public class CharacterRpg {


 private Long health = 1000L;

 private Integer level = 1;

 private Boolean alive= true;

    public CharacterRpg() {
    }

    public CharacterRpg(Integer level) {
        this.level = level;
    }

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
        if(victim==this){
            victim.damage(0L, this.level);
            return;

        }
        victim.damage(damage, this.level);
    }

    public void  damage( Long damage, Integer attakerLevel){

        int difLevels = attakerLevel - this.level;
        if ( difLevels >=5 ){
            this.health -= damage + (damage/2);
        }
        if(difLevels <= -5){
            this.health -= damage / 2;

        }
        if( difLevels >=0 && difLevels <=4){
            this.health -= damage;
        }

        if(this.health <= 0 ){
            this.alive= false;
        }


    }

    public void heals(CharacterRpg victim, long healing ) {
        if( this== victim){
            victim.healing(healing);
            return;
        }victim.healing(0L);



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
