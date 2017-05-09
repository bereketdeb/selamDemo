/**
 * Created by Bereketdeb on 5/8/2017.
 */

$(document).ready(main);

    function main() {
        $('.btn-collapse').click(function(e){
            e.preventDefault();
            var $this=$(this);
            var $collapse = $this.closest('.collapse-group').find('.collapse');
            $collapse.collapse('toggle');
    });

    }
    

