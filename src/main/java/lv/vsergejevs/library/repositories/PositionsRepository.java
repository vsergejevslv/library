package lv.vsergejevs.library.repositories;

import lv.vsergejevs.library.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsRepository extends JpaRepository<Position, Long> {
}