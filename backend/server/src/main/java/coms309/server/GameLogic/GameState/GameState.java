package coms309.server.GameLogic.GameState;

import coms309.server.GameLogic.Map.Map;
import coms309.server.Network.Message;
import coms309.server.Schema.DataObjectSchema;
import coms309.server.Server;
import coms309.server.Schema.GamestateSchema;

import java.util.logging.Level;

public class GameState {

    private Server server;
    private int status, round, difficulty;
    private Map map;

    // CONSTRUCTOR

    public GameState(Server s) {
        server = s;
        status = 0;
        difficulty = 1;
        round = 1;
        try {
            this.map = new Map(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // GETTERS

    public int getDifficulty() {
        return difficulty;
    }
    public int getStatus() {
        return status;
    }
    public int getRound() {
        return round;
    }
    public Map getMap() {
        return map;
    }

    // SETTERS

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        DataObjectSchema d =
                DataObjectSchema.newBuilder()
                        .setGamestate(
                                GamestateSchema.newBuilder()
                                        .setDifficulty(difficulty)
                                        .build()
                        ).build();
        server.getConnectionHandler().writeToAll(d);
        server.logger.log(Level.INFO, "Difficulty has been set to " + difficulty);
    }
    public void setMap(int map) throws Exception {
        this.map.loadMap(map);
        DataObjectSchema d =
                DataObjectSchema.newBuilder()
                        .setGamestate(
                                GamestateSchema.newBuilder()
                                        .setMap(map)
                                        .build()
                        ).build();
        server.getConnectionHandler().writeToAll(d);
        server.getConnectionHandler().writeToAll(new Message(
                "Server",
                "CHAT",
                "Map has been set to " + map
        ).serialize());
        server.logger.log(Level.INFO, "Map has been set to " + map);
    }
    public void setStatus(int status) {
        this.status = status;
        DataObjectSchema d =
                DataObjectSchema.newBuilder()
                        .setGamestate(
                                GamestateSchema.newBuilder()
                                        .setStatus(status)
                                        .build()
                        ).build();
        server.getConnectionHandler().writeToAll(d);
        server.logger.log(Level.INFO, "Status has been set to " + status);
    }
    public void setRound(int round) {
        this.round = round;
        DataObjectSchema d =
                DataObjectSchema.newBuilder()
                        .setGamestate(
                                GamestateSchema.newBuilder()
                                        .setRound(round)
                                        .build()
                        ).build();
        server.getConnectionHandler().writeToAll(d);
        server.logger.log(Level.INFO, "Round has been set to " + round);
    }

    // SERIALIZE

    public DataObjectSchema serialize() {
        DataObjectSchema d =
                DataObjectSchema.newBuilder()
                        .setGamestate(
                                GamestateSchema.newBuilder()
                                        .setDifficulty(difficulty)
                                        .setStatus(status)
                                        .setMap(map.getMapId())
                                        .setRound(round)
                                        .build()
                        ).build();
        return d;
    }
}