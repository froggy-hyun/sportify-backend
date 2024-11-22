package com.tuk.sportify.sportvoucher.dto;

import java.util.List;
import lombok.Builder;

@Builder
public record VoucherDetailResponse(
    Long voucherId,
    String voucherCourseName,
    String subCategory,
    String address,
    String duration,
    List<CrewResponse> crews) {}