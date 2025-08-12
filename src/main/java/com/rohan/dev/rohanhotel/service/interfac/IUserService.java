package com.rohan.dev.rohanhotel.service.interfac;

import com.rohan.dev.rohanhotel.dto.LoginRequest;
import com.rohan.dev.rohanhotel.dto.Response;
import com.rohan.dev.rohanhotel.model.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}  
