package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.DepositFeeRange;
import com.tobeto.rentACar.repositories.DepositFeeRangeRepository;
import com.tobeto.rentACar.services.abstracts.DepositFeeRangeService;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.AddDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.DeleteDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.UpdateDepositFeeRangeRequest;
import org.springframework.stereotype.Service;

@Service
public class DepositFeeRangeManager implements DepositFeeRangeService {

    private final DepositFeeRangeRepository depositFeeRangeRepository;

    public DepositFeeRangeManager(DepositFeeRangeRepository depositFeeRangeRepository) {
        this.depositFeeRangeRepository = depositFeeRangeRepository;
    }

    @Override
    public void add(AddDepositFeeRangeRequest addDepositFeeRangeRequest) {
        DepositFeeRange depositFeeRange =new DepositFeeRange();
        depositFeeRange.setDepositFeeRange(addDepositFeeRangeRequest.getDepositFeeRangeName());

        depositFeeRangeRepository.save(depositFeeRange);

    }

    @Override
    public void delete(DeleteDepositFeeRangeRequest deleteDepositFeeRangeRequest) {
        DepositFeeRange depositFeeRangeToDelete = depositFeeRangeRepository.findById(deleteDepositFeeRangeRequest.getDepositFeeRangeId()).orElseThrow();
        depositFeeRangeRepository.delete(depositFeeRangeToDelete);
    }

    @Override
    public void update(UpdateDepositFeeRangeRequest updateDepositFeeRangeRequest) {
        DepositFeeRange depositFeeRangeToUpdate = depositFeeRangeRepository.findById(updateDepositFeeRangeRequest.getDepositFeeRangeId()).orElseThrow();
        depositFeeRangeToUpdate.setDepositFeeRange(updateDepositFeeRangeRequest.getDepositFeeRangeName());
        depositFeeRangeRepository.saveAndFlush(depositFeeRangeToUpdate);
    }
}
