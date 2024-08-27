package Source;

import java.util.ArrayList;
import java.util.List;

public class Impl implements Inter{
    @Override
    public SourceConfiguration create(){
        SourceConfiguration st=new SourceConfiguration();
        List<Services> ls=new ArrayList();
        Services s=new Services();
        s.setUrl("http://example.com/api/vi");
       // ls.add(s);

        Headers h=new Headers();
        h.setKey("value");
        h.setAuthentication("basic");
        s.setHeaders(h);

        Authentication au=new Authentication();
        au.setUserName("@username");
        au.setPassWord("@password");
        au.setForceBasicAuthentication(Boolean.TRUE);
        s.setAuthentication(au);

        List<EndPoints> le=new ArrayList();
       // s.setEndPoints(le);
        EndPoints ep=new EndPoints();
        ep.setPath("/post");
        ep.setMethod("get");
       // le.add(ep);

        Paging pg=new Paging();
        pg.setPageSize(10);
        pg.setOffsetStart(0);
        pg.setOffsetType("page");
        ep.setPaging(pg);

        s.setEndPoints(le);
        ls.add(s);


        Parameters pm=new Parameters();
        pm.setLimit("limit");
        pm.setOffset("page");
        pg.setParameters(pm);


        QueryParameters qp=new QueryParameters();
        qp.setId(120);
        qp.setType("user");
        qp.setExpand(Boolean.TRUE);
        ep.setQueryParameters(qp);

        ep.setItemType("post");
        ep.setUri("%[Cover_url]/repository/posts/%[id]");
        ep.setClickableUri("%[coveo_url]/posts/%[id]\",\n");
        ep.setTitle("%[title]");
        ep.setModifiedDate("%[updated]");
        ep.setBody("%[html.content]");

        MetaData md=new MetaData();
        md.setId("%id");
        md.setAuthor("%[author]");
        ep.setMetaData(md);

        le.add(ep);

        EndPoints ep1=new EndPoints();
        ep1.setPath("/user");
        ep1.setMethod("Post");
        ep1.setItemPath("result");


       /* Paging pg1=new Paging();
        pg1.setPageSize(00);
        pg1.setOffsetStart(0);
        pg1.setOffsetType("Null");
        ep1.setPaging(pg1);
        le.add(ep1);
        s.setEndPoints(le);
        ls.add(s);*/






        QueryParameters qp1=new QueryParameters();
        qp1.setId(120);
        qp1.setType("user");
        qp1.setExpand(Boolean.TRUE);
        ep.setQueryParameters(qp1);

        ep.setItemType("user");
        ep.setUri("%[coveo_url]/repository/users/%[id]");
        ep.setClickableUri("%[coveo_url]/users/%[id]");
        ep.setTitle("name");
        ep.setModifiedDate("%[updated]");


        MetaData md1=new MetaData();
        md1.setId("%id");
        md1.setAuthor("%[name]");
        ep.setMetaData(md1);
        le.add(ep1);
        st.setServices(ls);
        return st;

    }
    @Override
    public void display(SourceConfiguration sad){
List<Services> services=sad.getServices();
for (Services ser:services){
    System.out.println("url"+ser.getUrl());
    Headers hr=ser.getHeaders();
    System.out.println("key"+hr.getKey());
    System.out.println("authentication"+hr.getAuthentication());
    Authentication ac= ser.getAuthentication();
    System.out.println("username"+ac.getUserName());
    System.out.println("password"+ac.getPassWord());
    System.out.println("ForceBasicAuthentication"+ac.getForceBasicAuthentication());
    List<EndPoints> lep=ser.getEndPoints();
    for(EndPoints ep:lep){
        System.out.println(ep.getPath());
        System.out.println(ep.getMethod());

        Paging px=ep.getPaging();
        if(px != null) {
            System.out.println(px.getPageSize());
            System.out.println(px.getOffsetStart());
            System.out.println(px.getOffsetType());

        }
        if(ep.getPaging() != null){
            Parameters pt=ep.getPaging().getParameters();
            System.out.println(pt.getLimit());
            System.out.println(pt.getOffset());
        }

        QueryParameters qp= ep.getQueryParameters();
        if(qp != null){
            System.out.println(qp.getId());
            System.out.println(qp.getType());
            System.out.println(qp.getExpand());
        }

        System.out.println(ep.getItemType());
        System.out.println(ep.getUri());
        System.out.println(ep.getClickableUri());
        System.out.println(ep.getTitle());
        System.out.println(ep.getModifiedDate());
        System.out.println(ep.getBody());
        MetaData me=ep.getMetaData();
        System.out.println(me.getAuthor());
        System.out.println(me.getId());
        System.out.println(ep.getPath());
        System.out.println(ep.getItemPath());
        System.out.println(ep.getMethod());
        System.out.println(ep.getItemType());
        System.out.println(me.getName());
        System.out.println(ep.getItemPath());
    }
}


    }
}
