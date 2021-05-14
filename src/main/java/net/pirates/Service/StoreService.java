package net.pirates.Service;

import net.pirates.DTOs.AddHolidayDTO;
import net.pirates.DTOs.AddStoreDTO;
import net.pirates.DTOs.StoreDTO;
import net.pirates.DTOs.StoreDetailDTO;
import net.pirates.Domain.Store;
import net.pirates.Repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public void addStore(AddStoreDTO storeInfo) {
        storeRepository.save(new Store(storeInfo));
    }

    public void addHoliday(AddHolidayDTO holidayDTO) {
    }

    public List<StoreDTO> storeList() {
        List<Store> storeList = storeRepository.findAll();
        List<StoreDTO> storeDTOList = new ArrayList<>();
        for(Store store : storeList) {
            storeDTOList.add(new StoreDTO(store));
        }
        /*

        i.	점포명, 점포 설명, 영업상태(영업중/영업종료/휴무) 정보를 등급(level) 오름차순으로 조회
        # 영업 상태 조건값
        영업중 (OPEN) : 영업 open time <= 현재시간 <= 영업 close time
        영업종료(CLOSE) : 현재시간 < 영업 open time, 현재시간 > 영업 close time
        휴무(HOLIDAY) : 오늘날짜가 해당 점포의 등록된 휴무일일 경우
         */


    }

    public StoreDetailDTO storeDetail(Long id) {
        return new StoreDetailDTO();
    }

    public void delete(Long id) {
        storeRepository.deleteById(id);
    }
}
