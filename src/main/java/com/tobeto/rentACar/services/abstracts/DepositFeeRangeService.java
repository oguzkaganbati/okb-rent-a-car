package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.AddDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.DeleteDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.UpdateDepositFeeRangeRequest;

public interface DepositFeeRangeService {
    void add(AddDepositFeeRangeRequest addDepositFeeRangeRequest);
    void delete(DeleteDepositFeeRangeRequest deleteDepositFeeRangeRequest);
    void update(UpdateDepositFeeRangeRequest updateDepositFeeRangeRequest);
}
