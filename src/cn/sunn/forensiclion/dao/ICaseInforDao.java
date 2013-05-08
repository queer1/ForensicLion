package cn.sunn.forensiclion.dao;

import cn.sunn.forensiclion.domain.CaseInfor;

public interface ICaseInforDao extends GenericDao<CaseInfor, Long> {
      /**
       *get max caseid
       * @return
       */
      public String findMxCaseid();
}
