package Source;

import java.util.ArrayList;
import java.util.List;

public class ImpleSource implements Inter {
    @Override
    public SourceConfiguration create(){
        SourceConfiguration sourceConfiguration=new SourceConfiguration();
        List<Services> listServices=new ArrayList();
        Services services=new Services();
        services.setUrl("http://example.com/api/v1");

        Headers headers=new Headers();
        headers.setKey( "value");
        headers.setAuthentication("basic");
services.setHeaders(headers);
        Authentication authentication=new Authentication();
        authentication.setUserName("@Username");
        authentication.setPassWord("@Password");
        authentication.setForceBasicAuthentication(true);
services.setAuthentication(authentication);

        List<EndPoints> endPointsList=new ArrayList();
        EndPoints endPoints=new EndPoints();
        endPoints.setPath( "/posts");
        endPoints.setMethod( "GET");

        Paging paging=new Paging();
        paging.setPageSize(10);
        paging.setOffsetStart(0);
        paging.setOffsetType("page");

        Parameters parameters=new Parameters();
        parameters.setLimit("limit");
        parameters.setOffset("page");
 paging.setParameters(parameters);
 endPoints.setPaging(paging);

        QueryParameters queryParameters=new QueryParameters();
        queryParameters.setId(120);
        queryParameters.setType("user");
        queryParameters.setExpand(true);
endPoints.setQueryParameters(queryParameters);
       endPoints.setItemType("Post");
       endPoints.setUri("%[coveo_url]/repository/posts/%[id]");
       endPoints.setClickableUri("%[coveo_url]/posts/%[id]");
       endPoints.setTitle("%[title]");
       endPoints.setModifiedDate("%[updated]");
       endPoints.setBody("%[html.content]");

       MetaData metaData=new MetaData();
       metaData.setAuthor( "%[author]");
       metaData.setId("%[id]");
       endPoints.setMetaData(metaData);
 endPointsList.add(endPoints);

       EndPoints endPoints1=new EndPoints();
       endPoints1.setPath("/users");
       endPoints1.setMethod("POST");
       endPoints1.setItemPath("results");
       QueryParameters payloadParameters=new QueryParameters();
       payloadParameters.setId(120);
       payloadParameters.setType("user");
       payloadParameters.setExpand(true);
 endPoints1.setQueryParameters(payloadParameters);
       endPoints1.setItemType("User");
       endPoints1.setUri("%[coveo_url]/repository/users/%[id]");
       endPoints1.setClickableUri( "%[coveo_url]/users/%[id]");
       endPoints1.setTitle("%[name]");
       endPoints1.setModifiedDate("%[updated]");

       MetaData metaData1=new MetaData();
       metaData1.setId("%[id]");
       metaData1.setName("%[id]");

       endPoints1.setMetaData(metaData1);
       endPointsList.add(endPoints1);
       services.setEndPoints(endPointsList);



listServices.add(services);
sourceConfiguration.setServices(listServices);
return sourceConfiguration ;
    }
@Override
    public void display(SourceConfiguration sad){
        List<Services> services=sad.getServices();
        for(Services services1:services){
            System.out.println(services1.getUrl());
            Headers headers=services1.getHeaders();
            System.out.println(headers.getKey());
            System.out.println(headers.getAuthentication());
            Authentication authentication=services1.getAuthentication();
            System.out.println(authentication.getUserName());
            System.out.println(authentication.getPassWord());
            System.out.println(authentication.getForceBasicAuthentication());
            List<EndPoints> endPoints=services1.getEndPoints();
            for (EndPoints endPoints1:endPoints){
                System.out.println(endPoints1.getPath());
                System.out.println(endPoints1.getMethod());
                System.out.println(endPoints1.getItemPath());
                Paging paging=endPoints1.getPaging();
                if(paging!=null) {
                    System.out.println(paging.getPageSize());
                    System.out.println(paging.getOffsetStart());
                    System.out.println(paging.getOffsetType());

                Parameters parameters= paging.getParameters();

                    System.out.println(parameters.getLimit());
                    System.out.println(parameters.getOffset());
                }
                QueryParameters queryParameters= endPoints1.getQueryParameters();
                System.out.println(queryParameters.getId());
                System.out.println(queryParameters.getType());
                System.out.println(queryParameters.getExpand());
                System.out.println(endPoints1.getItemType());
                System.out.println(endPoints1.getUri());
                System.out.println(endPoints1.getClickableUri());
                System.out.println(endPoints1.getTitle());
                System.out.println(endPoints1.getModifiedDate());
                System.out.println(endPoints1.getBody());
                MetaData metaData= endPoints1.getMetaData();
                System.out.println(metaData.getAuthor());
                System.out.println(metaData.getId());
                System.out.println(metaData.getName());


            }
        }

}
}
