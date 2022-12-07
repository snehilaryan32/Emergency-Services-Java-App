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
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectResult;


public class S3BucketOperations {
    
    public static PutObjectResult putObject(String bucketName, String source, String objectKey){
        
        BasicAWSCredentials creds = new BasicAWSCredentials(SystemConstants.AWS_ACCESS_KEY_ID, SystemConstants.AWS_SECRECT_ACCESS_KEY);
        
        AmazonS3 s3 = AmazonS3Client.builder().withRegion(SystemConstants.DEFAULT_REGION).withCredentials(new AWSStaticCredentialsProvider(creds)).build();
         
        File file = new File(source);
        PutObjectResult result = s3.putObject(bucketName, objectKey, file);
        System.out.println(result);
        
        return result; 
    }
    
}
