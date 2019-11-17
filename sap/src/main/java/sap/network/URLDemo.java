package sap.network;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws URISyntaxException {
        //String launchUrl ="https://hc7-716.wdf.sap.corp/ui#CustomerProject-createCustomerProject&/Create";
        //String launchUrl ="https://hc7-716.wdf.sap.corp/ui";
        //String url ="https://hc7-716.wdf.sap.corp/ui#CustomerProject-createCustomerProject&/Create";
        String launchUrl ="https://oc7-715.wdf.sap.corp/ui?sap-sec_session_created=X?";

        String appendQuery = "help-stateUACP=PRODUCTION";

    }

    /**
     * This method is written to add the url parameter in url
     * @param url
     * @param parameterQuery
     * @return url with appending the url parameter
     * @throws URISyntaxException
     */
    public static String getUrlWithAddedParameter(String url, String parameterQuery) throws URISyntaxException {
        URI oldUri = new URI(url);
        String newQuery = oldUri.getQuery();
        if (newQuery == null) {
            newQuery = parameterQuery;
        } else {
            newQuery += "&" + parameterQuery;
        }

        URI newUri = new URI(oldUri.getScheme(), oldUri.getAuthority(), oldUri.getPath(), newQuery,
                oldUri.getFragment());
        return  newUri.toString();
    }
    /*public static String appendURLParameter(String url, String parameter) {
        String finalUrl = url;
        URL buildUrl = null;
        String query = null;
        try {
            buildUrl = new URL(url);
            query = buildUrl.getQuery();
            String path = buildUrl.getPath();
            if (!finalUrl.contains(parameter)) {
                // Append the parameter only if it is not already present
                if (query.isEmpty()) {
                    if (!path.isEmpty()) {
                        //Append after path
                        finalUrl = StringUtils.substringBefore(finalUrl, path) + path + "?" + parameter + StringUtils.substringAfter(finalUrl, path);
                    }
                } else {
                    // Query is not empty.
                    // Append the url parameter with &
                    finalUrl = StringUtils.substringBefore(finalUrl, query) + query + "&" + parameter + StringUtils.substringAfter(finalUrl, query);
                }
            }
        } catch (Exception e) {
            STARTLogger.print("Exception while appending URL parameter!");
        }
        return finalUrl;
    }*/
}
