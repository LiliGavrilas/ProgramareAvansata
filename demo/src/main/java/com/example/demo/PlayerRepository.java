package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
   
 /*   public List<Player> getAll() {
     return new LinkedList<>();
    }

    public void save(Player player) {
    }

    public Player findById(long id) {
        return new Player();
    }

    public void Update(Player player) {
    }

    public void deleteById(long id) {

    }*/
}
