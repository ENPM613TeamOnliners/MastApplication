// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = { HelloLambdaApplication.class })
// @WebAppConfiguration
// public class HelloControllerTest {
//     private MockLambdaContext lambdaContext;
//     private SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
    
//     @Autowired 
//     private ObjectMapper mapper;
 
//     public HelloControllerTest() { 
//       lambdaContext = new MockLambdaContext(); 
//       this.handler = StreamLambdaHandler.handler; 
//     }

//     @Test public void testGreetingApi() throws JsonParseException, JsonMappingException, IOException {
//       AwsProxyRequest request = new AwsProxyRequestBuilder("/greeting", "GET").queryString("name", "John").build(); 
//       AwsProxyResponse response = handler.proxy(request, lambdaContext);
      
//       assertThat(response.getStatusCode(), equalTo(200)); 
//       GreetingDto responseBody = mapper.readValue(response.getBody(), GreetingDto.class);
//       asserThat(responseBody.getMessage(), equalTo("Hello John")); 
//     }
// }