package com.tedu.service.impl;

import com.tedu.entity.Blog;
import com.tedu.mapper.BlogMapper;
import com.tedu.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
