/**
 * 
 */
package com.raj.domain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.supercsv.cellprocessor.ParseBigDecimal;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.raj.domain.model.MedicineStore;

/**
 * @author raj007
 *
 */
public class DynamoDBExample {
	/*	static DynamoDB dynamoDB = new DynamoDB(new AmazonDynamoDBClient(
            new ProfileCredentialsProvider()));*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(new ProfileCredentialsProvider())
                .build();*/

		AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
				new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
				.build(); 
		//AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().setEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("","")).build();

		DynamoDB dynamoDb = new DynamoDB(dynamoDBClient);
		//CreateTableDynamo(dynamoDb);
		//DynamoDBMapperConfig dbMapperConfig = new DynamoDBMapperConfig(SaveBehavior.UPDATE_SKIP_NULL_ATTRIBUTES);
		DynamoDBMapper dbMapper = new  DynamoDBMapper(dynamoDBClient);
		/*CreateTableRequest createTableRequest= dbMapper.generateCreateTableRequest(MedicineStore.class);
		List<GlobalSecondaryIndex> globalSecondaryIndexs= createTableRequest.getGlobalSecondaryIndexes();
		for (GlobalSecondaryIndex globalSecondaryIndex : globalSecondaryIndexs) {
			globalSecondaryIndex.setProvisionedThroughput(new ProvisionedThroughput(1l, 1l));
		}
		createTableRequest.setGlobalSecondaryIndexes(globalSecondaryIndexs);
		
		createTableRequest.setProvisionedThroughput(new ProvisionedThroughput(1l,1l));
		//createTableRequest.withGlobalSecondaryIndexes(new GlobalSecondaryIndex().withIndexName("manufacturerId").withProvisionedThroughput(new ProvisionedThroughput(1l,1l)));
		//createTableRequest.withGlobalSecondaryIndexes(new GlobalSecondaryIndex().withIndexName("medicineCategoryId").withProvisionedThroughput(new ProvisionedThroughput(1l,1l)));
		
		Table  table=	dynamoDb.createTable(createTableRequest);
	 try {
		table.waitForActive();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	 System.out.println("table created");
		// readCSVFile(dbMapper); 
		
		/*	DeleteTableRequest deleteTableRequest = new DeleteTableRequest("Course");
		dynamoDBClient.deleteTable(deleteTableRequest);*/

		/*CreateTableRequest createTableRequest= dbMapper.generateCreateTableRequest(Course.class);
		createTableRequest.setProvisionedThroughput(new ProvisionedThroughput(1l,1l));
		Table  table=	dynamoDb.createTable(createTableRequest);
	 try {
		table.waitForActive();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	/*	Course course = new Course();
		course.setCourseId(130);
		course.setCourseCode(987);
		course.setCourseName("MCA");
		Set<String> center= new HashSet<String>();
		center.add("patna3");
		center.add("delhi4");
		course.setCenters(center);
		course.setExamCenter(Arrays.asList(new String[]{"india","america"}));
		dbMapper.save(course,SaveBehavior.APPEND_SET.config());
		System.out.println("data saved"); 
		System.out.println("loading :::::");
		Course course2= dbMapper.load(Course.class, 130,987);
		System.out.println("obj:::"+course2);*/
	 MedicineStore medicineStore = new MedicineStore();
	 medicineStore.setManufacturerId(5);
	 DynamoDBQueryExpression< MedicineStore> dbQueryExpression = new DynamoDBQueryExpression<MedicineStore>();
	 dbQueryExpression.setHashKeyValues( medicineStore);
	 dbQueryExpression.setIndexName("manufacturerId");
	 dbQueryExpression.setConsistentRead(false);
	 dbQueryExpression.withSelect(Select.ALL_ATTRIBUTES);
	 
	 PaginatedQueryList<MedicineStore> results= dbMapper.query(MedicineStore.class, dbQueryExpression,PaginationLoadingStrategy.EAGER_LOADING.config());
	 for (MedicineStore medicineStore2 : results) {
		System.out.println(medicineStore2);
	}


	}

	public static void loadCsvdata(DynamoDBMapper dbMapper){

	}

	public	static void readCSVFile(DynamoDBMapper dynamoDbMapper) {
		ICsvBeanReader beanReader = null;
		
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(), // id
				new NotNull(), // medName
				new NotNull(), // batchNo
				new ParseDate("yyyy-MM-dd"), // manf_date
				new ParseDate("yyyy-MM-dd"), // exp_date
				new ParseInt(), // qty
				new ParseBigDecimal(), // unitPrice
				new ParseBigDecimal(), // sellingPrice
				new ParseInt() ,// medicine_category_id
				new ParseInt() ,// manufacturer_id
				new ParseDate("YYYY-MM-dd hh:mm:ss") ,// dateCreated
				null ,// dateUpdated
				new NotNull() ,//med_dose
				new NotNull() ,//med_desc
				new NotNull() //med_type
		};
		/*id,medName,batchNo,manf_date,exp_date,qty,unitPrice,sellingPrice,medicine_category_id,
		manufacturer_id,dateCreated,dateUpdated,med_dose,med_desc,med_type*/
		try {
			beanReader = new CsvBeanReader(new FileReader("E:\\aws-cloude-guru\\mymedicine.csv"),
					CsvPreference.STANDARD_PREFERENCE);
			String[] header = beanReader.getHeader(true);
			MedicineStore medicineStore = null;
			while ((medicineStore = beanReader.read(MedicineStore.class, header, processors)) != null) {
				
				medicineStore.setDateUpdated(new Date());
				System.out.println("medicineStore::"+medicineStore);
				dynamoDbMapper.save(medicineStore);
			}
		} catch (FileNotFoundException ex) {
			System.err.println("Could not find the CSV file: " + ex);
		} catch (IOException ex) {
			System.err.println("Error reading the CSV file: " + ex);
		} finally {
			if (beanReader != null) {
				try {
					beanReader.close();
				} catch (IOException ex) {
					System.err.println("Error closing the reader: " + ex);
				}
			}
		}
	}

	public static void CreateTableDynamo(DynamoDB dynamoDB){


		List<KeySchemaElement> keySchema = new ArrayList<KeySchemaElement>();
		keySchema.add(new KeySchemaElement()
				.withAttributeName("id")
				.withKeyType(KeyType.HASH)); //Partition key

		ArrayList<AttributeDefinition> attributeDefinitions = new ArrayList<AttributeDefinition>();
		attributeDefinitions.add(new AttributeDefinition()
				.withAttributeName("id")
				.withAttributeType(ScalarAttributeType.N));
		CreateTableRequest createTableRequest = new CreateTableRequest().withTableName("Student").
				withAttributeDefinitions(attributeDefinitions).withKeySchema(keySchema)
				.withProvisionedThroughput(new ProvisionedThroughput().withReadCapacityUnits(5l).withWriteCapacityUnits(5l));
		Table table   =dynamoDB.createTable(createTableRequest);
		try {
			table.waitForActive();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		loadSampleData(dynamoDB);

	}

	public static void loadSampleData(DynamoDB dynamoDB){

		Table table = dynamoDB.getTable("Student");

		Item item = new Item().withPrimaryKey("id", 101).withString("name", "Rajeev").withInt("age", 29).withString("course", "MCA");
		Item item1 = new Item().withPrimaryKey("id", 102).withString("name", "saimon").withInt("age", 29).withString("course", "BCA");
		Item item2 = new Item().withPrimaryKey("id", 103).withString("name", "leo").withInt("age", 29).withString("course", "B-Tech");
		Item item3 = new Item().withPrimaryKey("id", 104).
				withString("name", "danial").withInt("age", 29).
				withString("course", "MCA");
		table.putItem(item);
		table.putItem(item2);
		table.putItem(item3);
		table.putItem(item1);

	}

}
