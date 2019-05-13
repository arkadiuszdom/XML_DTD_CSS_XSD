<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<svg version="1.1" xmlns="http://www.w3.org/2000/svg">
			<xsl:variable name="games_box_base_width" select='10' />
			<xsl:variable name="box_height" select='20' />
			<xsl:variable name="text_y_position_offset" select='15' />
			<xsl:variable name="interval_height" select='5' />
			<xsl:variable name="interval_x_position" select='20' />
			<xsl:variable name="rating_interval_x_position" select='40' />
			<xsl:variable name="box_x_position" select='100' />

			<xsl:for-each select="rankingGenreSummary/positionsTable/positionsTableDataRow">

				<xsl:variable name="games_number" select='count(positionsTableDataTitles/positionsTableDataTitle)' />
				<xsl:variable name="y_position" select='position() * ($box_height + $interval_height)' />
				<xsl:variable name="games_box_width" select='$games_number*$games_box_base_width' />
				<xsl:variable name="rating" select='positionsTableDataSummedRating' />
				<xsl:variable name="rating_box_width" select='$rating*$games_box_base_width' />
				<xsl:variable name="games_x_width" select='150' />

				<g>
					<text y="{$y_position + $text_y_position_offset}">
						<xsl:value-of select="positionsTableDataGenre"/>:
					</text>

					<rect width="{$games_box_width}" height="{$box_height}" x="{$box_x_position}" y="{$y_position}"></rect>
					<text y="{$y_position + $text_y_position_offset}" x="{$box_x_position + $games_box_width + $interval_x_position}">
						<xsl:value-of select="$games_number"/> gier 
					</text>

					<rect width="{$rating_box_width}" height="{$box_height}" x="{$games_x_width + $box_x_position + $interval_x_position}" y="{$y_position}"></rect>
					<text y="{$y_position + $text_y_position_offset}" x="{$games_x_width + $box_x_position + $rating_interval_x_position + $rating_box_width}">
						<xsl:value-of select="$rating"/> punktów 
					</text>
				</g>

			</xsl:for-each>
		

		  <circle cx="250" cy="250" r="50" fill="red" />
		  <script type="text/javascript"><![CDATA[
		    var KEY = { w:87, a:65, s:83, d:68 };
		    var moveSpeed = 5;
		    var circle = document.getElementsByTagName("circle")[0];
		    var x = circle.getAttribute('cx')*1,
		        y = circle.getAttribute('cy')*1;
		    document.documentElement.addEventListener('keydown',function(evt){
		      switch (evt.keyCode){
		        case KEY.w:
		          circle.setAttribute('cy',y-=moveSpeed);
		          // Alternatively:
		          // circle.cy.baseVal.value = (y-=moveSpeed);
		        break;
		        case KEY.s:
		          circle.setAttribute('cy',y+=moveSpeed);
		        break;
		        case KEY.a:
		          circle.setAttribute('cx',x-=moveSpeed);
		        break;
		        case KEY.d:
		          circle.setAttribute('cx',x+=moveSpeed);
		        break;
		      }
		    },false);
		  ]]></script>
		</svg>
	</xsl:template>
</xsl:stylesheet>