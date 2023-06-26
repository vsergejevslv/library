package lv.vsergejevs.library.services;

import lv.vsergejevs.library.models.Position;
import lv.vsergejevs.library.repositories.PositionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionsService {
    private final PositionsRepository positionsRepository;

    @Autowired
    public PositionsService(PositionsRepository positionsRepository) {
        this.positionsRepository = positionsRepository;
    }

    public Position getPosition(Long id) {
        return positionsRepository.findById(id).orElse(null);
    }

    public List<Position> getPositions() {
        return positionsRepository.findAll();
    }

    public void addPosition(Position position) {
        positionsRepository.save(position);
    }

    public void updatePosition(Position updatedPosition, Long id) {
        updatedPosition.setId(id);
        positionsRepository.save(updatedPosition);
    }

    public void deletePosition(Long id) {
        positionsRepository.deleteById(id);
    }

}
