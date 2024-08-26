package com.nc13.item.service;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    List<Long> getRoomIdsByDormId(Long dormId);

    Optional<Long> findRoomIdByDormId(Long dormId);

}
