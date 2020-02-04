package com.shuttle.common.service.impl;

import java.beans.Statement;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.shuttle.common.config.ShuttleConfig;
import com.shuttle.common.dao.FileDao;
import com.shuttle.common.domain.FileDO;
import com.shuttle.common.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	@Autowired
	private FileDao sysFileMapper;

	@Autowired
	private ShuttleConfig shuttleConfig;

	@Override
	public FileDO get(Long id) {
		return sysFileMapper.get(id);
	}

	@Override
	public List<FileDO> list(Map<String, Object> map) {
		return sysFileMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return sysFileMapper.count(map);
	}

	@Override
	public int save(FileDO sysFile) {
		return sysFileMapper.save(sysFile);
	}

	@Override
	public int update(FileDO sysFile) {
		return sysFileMapper.update(sysFile);
	}

	@Override
	public int remove(Long id) {
		return sysFileMapper.remove(id);
	}

	@Override
	public int batchRemove(Long[] ids) {
		return sysFileMapper.batchRemove(ids);
	}

	@Override
	public Boolean isExist(String url) {
		Boolean isExist = false;
		if (!StringUtils.isEmpty(url)) {
			String filePath = url.replace("/files/", "");
			filePath = shuttleConfig.getUploadPath() + filePath;
			File file = new File(filePath);
			if (file.exists()) {
				isExist = true;
			}
		}
		return isExist;
	}

	@Override
	public void createPartition() {
		Map<String, Object> map = new HashMap<String, Object>(16);
//		getData();
		map.put("tableName", "user");
		map.put("column", "sex");
		map.put("partitionName", "p_1210");
		map.put("sum", "6");
		map.put("sql", "ALTER TABLE user1 partition BY RANGE COLUMNS(sex)(partition p_1201 VALUES LESS THAN (6))");
		map.put("sql1", "select * from user");
		map.put("sql2", "ALTER TABLE `user` ADD INDEX sex_index(sex)");
		map.put("sql3", "alter table user1 add partition(partition p_1212 VALUES LESS THAN (10))");
		sysFileMapper.createPartition(map);

	}

	// 初始化connection
	public Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("开始初始化connection");
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/xybk?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC",
					"root", "root");
			System.out.println("数据库驱动加载完成");
		} catch (ClassNotFoundException e) {
			System.out.println("你妹的");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public void getData() {
		try {
//			resultSet = getConn().createStatement().executeQuery("SELECT * from sys_tds_user");
			int x = getConn().createStatement().executeUpdate(
					"ALTER TABLE user1 partition BY RANGE COLUMNS(sex)(partition p_1202 VALUES LESS THAN (9))");
//			PreparedStatement pre = getConn().prepareStatement(
//					"ALTER TABLE user1 partition BY RANGE COLUMNS(sex)(partition p_1202 VALUES LESS THAN (9))");
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString("name"));
//			}
			System.out.println("执行结果" + x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
