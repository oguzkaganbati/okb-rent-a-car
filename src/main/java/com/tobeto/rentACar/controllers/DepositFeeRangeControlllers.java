package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.DepositFeeRangeService;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.AddDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.DeleteDepositFeeRangeRequest;
import com.tobeto.rentACar.services.dtos.deposit_fee_range.requests.UpdateDepositFeeRangeRequest;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/deposit_fee_ranges")
public class DepositFeeRangeControlllers
{
    private DepositFeeRangeService depositFeeRangeService;

    public DepositFeeRangeControlllers(DepositFeeRangeService depositFeeRangeService) {
        this.depositFeeRangeService = depositFeeRangeService;
    }

    @PostMapping
    public void add(@RequestBody AddDepositFeeRangeRequest addDepositFeeRangeRequest){
        depositFeeRangeService.add(addDepositFeeRangeRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteDepositFeeRangeRequest deleteDepositFeeRangeRequest){
        depositFeeRangeService.delete(deleteDepositFeeRangeRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateDepositFeeRangeRequest updateDepositFeeRangeRequest){
        depositFeeRangeService.update(updateDepositFeeRangeRequest);
    }
}
