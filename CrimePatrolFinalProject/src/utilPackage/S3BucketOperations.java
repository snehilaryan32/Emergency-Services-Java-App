/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

/**
 *
 * @author aryan
 */
import java.util.*;
import java.io.File;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.mediastoredata.model.GetObjectResult;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.FileOutputStream;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import net.snowflake.client.jdbc.internal.apache.commons.io.FileUtils;
//
//
public class S3BucketOperations {
    
    static AmazonS3 s3Client = null;
    
    public static void setAmazonConnection() {
        Regions clientRegion = Regions.US_EAST_1;
           
        try {
            s3Client = AmazonS3ClientBuilder.standard().withRegion(clientRegion).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        
    public static void downloadS3Object(String fileName) {
        setAmazonConnection();
        S3Object s3object = s3Client.getObject("aed-dev", fileName);
        S3ObjectInputStream inputStream = s3object.getObjectContent();
        try {
            FileUtils.copyInputStreamToFile(inputStream, new File("/Users/bashu/Desktop/newImg.png"));
        } catch (IOException ex) {
            Logger.getLogger(S3BucketOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void uploadS3Object(String imagePath) {
        setAmazonConnection();
        File file = new File(imagePath);
        PutObjectResult result = s3Client.putObject(SystemConstants.S3_BUCKET_NAME, "newEvidence.png", file);
        System.out.println(result);
    }
   

    
//    
//    public static PutObjectResult putObjectToS3(String bucketName, String source, String objectKey){
//        
//        BasicAWSCredentials creds = new BasicAWSCredentials(SystemConstants.AWS_ACCESS_KEY_ID, SystemConstants.AWS_SECRECT_ACCESS_KEY);
//        
//        AmazonS3 s3 = AmazonS3Client.builder().withRegion(SystemConstants.DEFAULT_REGION).withCredentials(new AWSStaticCredentialsProvider(creds)).build();
//         
//        File file = new File(source);
//        PutObjectResult result = s3.putObject(bucketName, objectKey, file);
//        System.out.println(result);
//        
//        return result; 
//    }
//    
//    public static ObjectMetadata getObjectFromS3(String bucketName, String destination, String objectKey){
//        
//        BasicAWSCredentials creds = new BasicAWSCredentials(SystemConstants.AWS_ACCESS_KEY_ID, SystemConstants.AWS_SECRECT_ACCESS_KEY);
//        
//        AmazonS3 s3 = AmazonS3Client.builder().withRegion(SystemConstants.DEFAULT_REGION).withCredentials(new AWSStaticCredentialsProvider(creds)).build();
//         
//        
//        S3Object object = s3.getObject(bucketName, objectKey);
//        
//        S3ObjectInputStream inputStream = object.getObjectContent();
//        
//        GetObjectRequest request = new GetObjectRequest(bucketName, objectKey);
//             
//        ObjectMetadata metadata = s3.getObject(request, new File("s4.png"));
//        
//        
//        //System.out.println(result);
//        
//        return metadata; 
//        
//    }
//    
}
