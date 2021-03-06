package io.junye.android.updater.dao;

import io.junye.android.updater.entity.Apk;
import io.junye.android.updater.entity.App;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/3/17 0017.
 */
public interface ApkDao extends JpaRepository<Apk,Long> {

    Apk findByAppAndVersionCode(App app,Long versionCode);

    Apk findTopByAppOrderByVersionCodeDesc(App app);

}
