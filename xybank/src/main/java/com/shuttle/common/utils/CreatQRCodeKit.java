package com.shuttle.common.utils;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreatQRCodeKit {

    /**
     * 生成二维码图片
     * @param width 生成的图片宽度
     * @param heigth 生成的图片高度
     * @param contents 二维码包含内容
     * @param format  生成的图片类型  
     * @param path 存储二维码路径
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void creatQRCode(int width, int height, String contents, String format, String path){
        //定义二维码的参数  
        HashMap hints = new HashMap();  
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");  
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//设置二维码的容错等级  
        hints.put(EncodeHintType.MARGIN, 2);//边距  
          
        try {  
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints); 
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            Path filePath = file.toPath();//保存的路径  
            MatrixToImageWriter.writeToPath(bitMatrix, format, filePath);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
    }
    
    public static void main(String[] args) {
//        //定义二维码的样式  
//        int width = 300;  
//        int height = 300;  
//        String format = "png";  
//        String contents = "17608015192";//扫描二维码时产生的连接  
//          
//        //定义二维码的参数  
//        HashMap hints = new HashMap();  
//        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");  
//        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//设置二维码的容错等级  
//        hints.put(EncodeHintType.MARGIN, 2);//边距  
//          
//        try {  
//            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints); 
//            File file = new File("D:/img.png");
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            Path filePath = file.toPath();//保存的路径  
//            MatrixToImageWriter.writeToPath(bitMatrix, format, filePath);  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
    }  
}
