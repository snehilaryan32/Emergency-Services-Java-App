/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

/**
 *
 * @author aryan
 */
//import java.util.*;
//import java.io.File;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.mediastoredata.model.GetObjectResult;
//import com.amazonaws.services.s3.model.GetObjectRequest;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.amazonaws.services.s3.model.PutObjectResult;
//import com.amazonaws.services.s3.model.S3Object;
//import com.amazonaws.services.s3.model.S3ObjectInputStream;
//import java.io.FileOutputStream;
//
//
//public class S3BucketOperations {
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
//}
