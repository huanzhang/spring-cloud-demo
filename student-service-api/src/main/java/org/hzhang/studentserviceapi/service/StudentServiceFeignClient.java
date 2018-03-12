package org.hzhang.studentserviceapi.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by xm180224 on 12/03/2018.
 */
@FeignClient(value = "student-service")
public interface StudentServiceFeignClient extends StudentService {
}
