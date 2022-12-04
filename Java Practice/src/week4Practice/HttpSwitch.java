package week4Practice;

public class HttpSwitch {

    public static void main(String[] args) {

        int statusCode = 400;
        String error;


        switch(statusCode){

            case 200:
                error = "OK";
                break;

            case 201:
                error = "Created";
                break;

            case 202:
                error ="Accepted";
                break;

            case 301:
                error="Moved permanently";
                break;

            case 303:
                error="See other";
                break;

            case 304:
                error="Not modified";
                break;

            case 307:
                error="Temporary Redirect";
                break;

            case 400:
                error="Bad request";
                break;

            case 401:
                error="Unauthorized";
                break;

            case 403:
                error="Forbidden";
                break;

            case 404:
                error="Not found";
                break;

            case 410:
                error="Gone";
                break;

            case 500:
                error="Internal Server Error";
                break;

            case 503:
                error="Service unavailable";
                break;

            default:
                error="Invalid error number";




        }

        System.out.println(error);


    }
}
/*
HTTP is the protocol that governs communications between web-
servers and web clients. Part of the protocol includes a status code
returned by the server to tell the browser the status of its most recent
page request.
Some of the codes and their meanings are listed below:
status code:
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
declare an int variable called StatusCode, write a switch that
prints out, on a line by itself, the appropriate label from the above list
based on status.
Example:
if status code = 200
output:
ok
 */