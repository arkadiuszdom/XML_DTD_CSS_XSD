<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
				version="2.0">

  <xsl:template match="musicLibraryReport">
    <svg width="40cm" height="75cm"  xmlns="http://www.w3.org/2000/svg">

	  <script type="text/ecmascript"> <![CDATA[
		    function markWithColor(evt) {
		      var rect = evt.target;
		      var currentFill = rect.getAttribute("fill");
		      if (currentFill=="#ff0000")
		        rect.setAttribute("fill", "#0000ff");
		      else
		        rect.setAttribute("fill", "#ff0000");
		   }
	  ]]> </script>


<text x="55" y="55" font-family="Verdana" font-size="35" fill="blue" >
			Games' release dates:
		</text>
    	<xsl:for-each select="Gra">
    		<xsl:variable name="Data_premiery" select="@Data_premiery"/>
    			<rect onclick="markWithColor(evt)" x="750" y="{$song_position + 150}" height="30" width="0" fill="#0000ff" stroke="black" stroke-width="1">
    			<animate attributeType="XML" attributeName="width" from="0" to="{$lengthDouble}"
	        	dur="3s" fill="freeze"/>
	        	</rect>
	            <text x="100" y="{$song_position + 180}" font-family="Verdana" font-size="30" fill="green">
	              <xsl:value-of select="."/>
	            </text>
	            <text x="550" y="{$song_position + 180}" font-family="Verdana" font-size="30" fill="blue">
	              <xsl:value-of select="$length"/>
	            </text>
    	</xsl:for-each>
	</svg>
  </xsl:template>

</xsl:stylesheet>
