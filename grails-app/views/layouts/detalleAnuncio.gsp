

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>
			<g:layoutTitle default="Autos usados en mexico " />
        </title>
        <link href="${resource(dir: 'css', file: 'apmain.css')}" media="all" rel="stylesheet" type="text/css"/>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.js" type="text/javascript">
        </script>
        <script type="text/javascript">
            
            $(document).ready(function(){
            
                $(".slidingDiv").show();
                $(".show_hide").show();
                
                $('.show_hide').click(function(){
                    $(".slidingDiv").slideToggle();
                });
                
            });
        </script>
        <g:layoutHead />
        
    </head>
    <body>
        <ap:header name="header"  />
        <div class="wrapper">
     				<g:layoutBody />
        </div>
  		<ap:footer name="footer" />
    </body>
</html>
