package com.esprit.alphadev.TunisieCamp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse extends GenericResponse{

    List<OrderDto> orderDtos;
}