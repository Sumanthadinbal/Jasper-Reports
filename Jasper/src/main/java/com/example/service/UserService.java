package com.example.service;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.example.beanprovider.UserBeanProvider;
import com.example.entity.Pool;
import com.example.entity.User;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;

@Service
public class UserService {

	public byte[] getUserReport(String type, String user, String lang, HttpServletResponse response) {
		String sourceFileName = System.getProperty("user.dir")+"\\src\\main\\resources\\inventoty.jasper";
		List<User> dataList = UserBeanProvider.getUsers();
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataList);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Map<String, Object> parameters = new HashMap();
		parameters.put("user", user.toLowerCase());
		parameters.put(JRParameter.REPORT_LOCALE, new Locale(lang));
		JasperPrint print = null;
		try {
			print = JasperFillManager.fillReport(sourceFileName, parameters, beanColDataSource);
			if (print != null) {
				if (type.equalsIgnoreCase("pdf")) {
					JasperExportManager.exportReportToPdfStream(print, out);
					response.setContentType("application/pdf");
					response.setHeader("Content-Disposition", "attachment; filename=" + "inventory" + ".pdf");
				}
				if (type.equalsIgnoreCase("html")) {
					@SuppressWarnings("deprecation")
					JRHtmlExporter htmlexporter = new JRHtmlExporter();
					htmlexporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
					htmlexporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
					htmlexporter.exportReport();
					response.setContentType("application/html");
					response.setHeader("Content-Disposition", "attachment; filename=" + "inventory" + ".html");
					// response.getOutputStream().write(out);
				}
				if (type.equalsIgnoreCase("csv")) {
					JRXlsExporter exporter = new JRXlsExporter();

					exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
					exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
					exporter.exportReport();
					response.setContentType("application/xls");
					response.setHeader("Content-Disposition", "attachment; filename=" + "inventory" + ".xls");
				}
			}
		} catch (JRException e) {
			e.printStackTrace();
		}
		return out != null ? out.toByteArray() : null;
	}

	public byte[] getStockReport(HttpServletResponse response){
		String sourceFileName = System.getProperty("user.dir")+"\\src\\main\\resources\\inventoty.jasper";
		List<Pool> dataList = UserBeanProvider.getPools();
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataList);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Map<String, Object> parameters = new HashMap();
		JasperPrint print = null;
		try {
			print = JasperFillManager.fillReport(sourceFileName, parameters, beanColDataSource);
			if (print != null) {
					JasperExportManager.exportReportToPdfStream(print, out);
					response.setContentType("application/pdf");
					response.setHeader("Content-Disposition", "attachment; filename=" + "inventory" + ".pdf");
				}
				
		} catch (JRException e) {
			e.printStackTrace();
		}
		return out != null ? out.toByteArray() : null;
	}
}
