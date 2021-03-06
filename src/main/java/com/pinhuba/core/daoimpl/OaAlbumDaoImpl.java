package com.pinhuba.core.daoimpl;

import org.springframework.stereotype.Repository;

import com.pinhuba.core.pojo.*;
import com.pinhuba.core.dao.*;
/**
 * 表：OA_ALBUM 对应daoImpl
 */
@Repository
public class OaAlbumDaoImpl extends BaseHapiDaoimpl<OaAlbum, Long> implements IOaAlbumDao {

   public OaAlbumDaoImpl(){
      super(OaAlbum.class);
   }
}