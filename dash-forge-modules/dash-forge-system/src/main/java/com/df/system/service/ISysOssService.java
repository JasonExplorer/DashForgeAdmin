package com.df.system.service;

import com.df.common.mybatis.core.page.PageQuery;
import com.df.common.mybatis.core.page.TableDataInfo;
import com.df.system.domain.bo.SysOssBo;
import com.df.system.domain.vo.SysOssVo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * 文件上传 服务层
 *
 * @author Lion Li
 */
public interface ISysOssService {

    TableDataInfo<SysOssVo> queryPageList(SysOssBo sysOss, PageQuery pageQuery);

    List<SysOssVo> listByIds(Collection<Long> ossIds);

    SysOssVo getById(Long ossId);

    SysOssVo upload(MultipartFile file);

    SysOssVo upload(File file);

    void download(Long ossId, HttpServletResponse response) throws IOException;

    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);

}
