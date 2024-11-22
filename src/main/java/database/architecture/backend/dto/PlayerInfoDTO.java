package database.architecture.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerInfoDTO {
    private String playerName;
    private String playerBorn;
    private String playerDraft;
    private String playerPos;
    private boolean playerBattingSide;
    private boolean playerThrowSide;
}
